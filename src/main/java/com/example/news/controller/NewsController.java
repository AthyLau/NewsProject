package com.example.news.controller;

import com.example.news.commonbox.Result;
import com.example.news.commonbox.ResultCode;
import com.example.news.commonbox.ResultGenerator;
import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.NewsDTO;
import com.example.news.domain.dto.RoleAndPermission;
import com.example.news.service.AuthService;
import com.example.news.service.NewsService;
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
import java.util.*;
/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/24 下午4:16
 * @since JDK 1.8
 */

@Validated
@RestController
@RequestMapping("/news")
@Api(description = "新闻controller")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private AuthService authService;
    @Autowired
    private NewsTypeService newsTypeService;

    /**
     * 添加
     * @param newsDTO
     * @return
     */
    @ApiOperation(value = "添加新闻", httpMethod = "POST")
    @PostMapping("/add_news")
    @RequiresAuthentication
    //这六种类型的管理员都可以调用这个接口
    @RequiresPermissions(value = {"type:体育","type:娱乐"},logical= Logical.OR)
    public Result addNews(@RequestBody NewsDTO newsDTO){
        RoleAndPermission roleAndPermission = authService.getRoleAndPermission();
        if(!roleAndPermission.getPermissionName().contains(newsTypeService.findById(new IntIdDTO(newsDTO.getNewsTypeId())).getTypeName())){
            return ResultGenerator.genFailResult("添加新闻失败");
        }
        if(newsService.addNews(newsDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加新闻失败");
    }

    /**
     * 删除
     * @param intIdDTO
     * @return
     */
    @ApiOperation(value = "删除新闻", httpMethod = "POST")
    @PostMapping("/del/byId")
    @RequiresAuthentication
    public Result delById(@RequestBody IntIdDTO intIdDTO){
        NewsDTO newsDTO = newsService.findById(intIdDTO);
        RoleAndPermission roleAndPermission = authService.getRoleAndPermission();
        if(!roleAndPermission.getPermissionName().contains(newsTypeService.findById(new IntIdDTO(newsDTO.getNewsTypeId())).getTypeName())){
            return ResultGenerator.genFailResult("删除新闻失败");
        }
        if(newsService.delById(intIdDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("删除新闻失败");
    }

    /**
     * 修改
     * @param newsDTO
     * @return
     */
    @ApiOperation(value = "修改新闻", httpMethod = "POST")
    @PostMapping("/update/byId")
    @RequiresAuthentication
    public Result updateById(@RequestBody NewsDTO newsDTO){
        RoleAndPermission roleAndPermission = authService.getRoleAndPermission();
        if(!roleAndPermission.getPermissionName().contains(newsTypeService.findById(new IntIdDTO(newsDTO.getNewsTypeId())).getTypeName())){
            return ResultGenerator.genFailResult("更新新闻失败");
        }
        if(newsService.updateById(newsDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("更新新闻失败");
    }

    /**
     * 查询所有
      * @return
     */
    @ApiOperation(value = "查询所有新闻", httpMethod = "POST")
    @PostMapping("/find/all")
    @RequiresAuthentication
    public Result findAll(){
        List<NewsDTO> list = newsService.findAll();
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
    @ApiOperation(value = "根据新闻id查询单个新闻", httpMethod = "POST")
    @PostMapping("/find/byId")
    @RequiresAuthentication
    public Result findById(@RequestBody IntIdDTO intIdDTO){
        NewsDTO newsDTO = newsService.findById(intIdDTO);
        if(newsDTO!=null){
            return ResultGenerator.genSuccessResult(newsDTO);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

    /**
     * 查询单类
     * @param intIdDTO
     * @return
     */
    @ApiOperation(value = "根据新闻类别id查询某类新闻", httpMethod = "POST")
    @PostMapping("/find/byTypeId")
    @RequiresAuthentication
    public Result findByTypeId(@RequestBody IntIdDTO intIdDTO){
        List<NewsDTO> newsDTOList = newsService.findByTypeId(intIdDTO);
        if(newsDTOList!=null&&newsDTOList.size()>0){
            return ResultGenerator.genSuccessResult(newsDTOList);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
}
