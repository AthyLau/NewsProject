package com.example.news.controller;

import com.example.news.commonbox.Result;
import com.example.news.commonbox.ResultCode;
import com.example.news.commonbox.ResultGenerator;
import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.NewsDTO;
import com.example.news.domain.dto.NewsTypeDTO;
import com.example.news.domain.dto.RoleAndPermission;
import com.example.news.service.AuthService;
import com.example.news.service.NewsTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/24 下午4:18
 * @since JDK 1.8
 */

@Validated
@RestController
@RequestMapping("/newstype")
@Api(description = "新闻类型controller")
public class NewsTypeController {
    @Autowired
    private AuthService authService;
    @Autowired
    private NewsTypeService newsTypeService;
    /**
     * 添加
     * @param newsTypeDTO
     * @return
     */
    @ApiOperation(value = "添加新闻类型", httpMethod = "POST")
    @PostMapping("/add_newsType")
    @RequiresAuthentication
//    //这六种类型的管理员都可以调用这个接口
//    @RequiresPermissions(value = {"type:体育","type:娱乐"},logical= Logical.OR)
    public Result addNewsType(@RequestBody NewsTypeDTO newsTypeDTO){
//        RoleAndPermission roleAndPermission = authService.getRoleAndPermission();
//        if(!roleAndPermission.getPermissionName().contains(NewsTypeService.GetTypeNameById(newsDTO.getNewsTypeId()))){
//            return ResultGenerator.genFailResult("添加新闻类型失败");
//        }
        if(newsTypeService.addNewsType(newsTypeDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加新闻类型失败");
    }

    /**
     * 删除
     * @param intIdDTO
     * @return
     */
    @ApiOperation(value = "删除新闻类型", httpMethod = "POST")
    @PostMapping("/del/byId")
    @RequiresAuthentication
    public Result delById(@RequestBody IntIdDTO intIdDTO){
        if(newsTypeService.delById(intIdDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("删除新闻类型失败");
    }

    /**
     * 修改
     * @param newsTypeDTO
     * @return
     */
    @ApiOperation(value = "修改新闻类型", httpMethod = "POST")
    @PostMapping("/update/byId")
    @RequiresAuthentication
    public Result updateById(NewsTypeDTO newsTypeDTO){
        if(newsTypeService.updateById(newsTypeDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("更新新闻失败");
    }

    /**
     * 查询所有
     * @return
     */
    @ApiOperation(value = "查询所有新闻类型", httpMethod = "POST")
    @PostMapping("/find/all")
    @RequiresAuthentication
    public Result findAll(){
        List<NewsTypeDTO> list = newsTypeService.findAll();
        if(list==null&&list.size()==0){
            return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
        }
        return ResultGenerator.genSuccessResult(list);
    }

    /**
     * 查询单个
     * @param intIdDTO
     * @return
     */
    @ApiOperation(value = "查询单个新闻类型", httpMethod = "POST")
    @PostMapping("/find/byId")
    @RequiresAuthentication
    public Result findById(@RequestBody IntIdDTO intIdDTO){
        NewsTypeDTO newsDTO = newsTypeService.findById(intIdDTO);
        if(newsDTO!=null){
            return ResultGenerator.genSuccessResult(newsDTO);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

}
