package com.example.news.controller;

import com.example.news.commonbox.Result;
import com.example.news.commonbox.ResultCode;
import com.example.news.commonbox.ResultGenerator;
import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.NewsTypeDTO;
import com.example.news.domain.dto.ReviewDTO;
import com.example.news.service.AuthService;
import com.example.news.service.NewsTypeService;
import com.example.news.service.ReviewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
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
@RequestMapping("/review")
@Api(description = "评论controller")
public class ReviewController {
    @Autowired
    private AuthService authService;
    @Autowired
    private ReviewService reviewService;
    /**
     * 添加
     * @param reviewDTO
     * @return
     */
    @ApiOperation(value = "添加评论", httpMethod = "POST")
    @PostMapping("/add_review")
    @RequiresAuthentication
//    //这六种类型的管理员都可以调用这个接口
//    @RequiresPermissions(value = {"type:体育","type:娱乐"},logical= Logical.OR)
    public Result addReview(@RequestBody ReviewDTO reviewDTO){
//        RoleAndPermission roleAndPermission = authService.getRoleAndPermission();
//        if(!roleAndPermission.getPermissionName().contains(NewsTypeService.GetTypeNameById(newsDTO.getNewsTypeId()))){
//            return ResultGenerator.genFailResult("添加新闻类型失败");
//        }
        if(reviewService.addReview(reviewDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加失败");
    }

    /**
     * 删除
     * @param intIdDTO
     * @return
     */
    @ApiOperation(value = "删除评论", httpMethod = "POST")
    @PostMapping("/del/byId")
    @RequiresAuthentication
    public Result delById(@RequestBody IntIdDTO intIdDTO){
        if(reviewService.delById(intIdDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("删除失败");
    }

    /**
     * 修改
     * @param reviewDTO
     * @return
     */
    @ApiOperation(value = "修改评论", httpMethod = "POST")
    @PostMapping("/update/byId")
    @RequiresAuthentication
    public Result updateById(@RequestBody ReviewDTO reviewDTO){
        if(reviewService.updateById(reviewDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("更新评论失败");
    }


    /**
     * 查询某个新闻的评论列表
     * @param intIdDTO
     * @return
     */
    @ApiOperation(value = "查询某个新闻的评论", httpMethod = "POST")
    @PostMapping("/find/byId")
    @RequiresAuthentication
    public Result findById(@RequestBody IntIdDTO intIdDTO){
        List<ReviewDTO> reviewDTOS = reviewService.findById(intIdDTO);
        if(reviewDTOS!=null){
            return ResultGenerator.genSuccessResult(reviewDTOS);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
}
