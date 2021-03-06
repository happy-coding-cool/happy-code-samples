package cool.happycoding.code.cache.sample.rest;

import cool.happycoding.code.base.result.BaseResult;
import cool.happycoding.code.cache.sample.dto.UserBean;
import cool.happycoding.code.cache.sample.service.UserCacheService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * description
 *
 * @author lanlanhappy 2021/02/27 5:03 下午
 */
@Slf4j
@Api(tags = "cached注解使用测试")
@RestController
@RequestMapping("cached")
public class CachedController {

    private final UserCacheService userCacheServiceImpl;

    public CachedController(UserCacheService userCacheServiceImpl) {
        this.userCacheServiceImpl = userCacheServiceImpl;
    }

    @GetMapping("getByUserId/{userId}")
    public BaseResult<UserBean> getByUserId(@PathVariable String userId){
        return BaseResult.success(userCacheServiceImpl.getById(userId));
    }

    @PostMapping("update-CacheBean/{userId}")
    @ApiOperation(value = "更新upateCacheBean")
    public BaseResult<UserBean> updateCacheBean(@PathVariable String userId){
        UserBean userBean = new UserBean(userId, "李四");
        return BaseResult.success(userCacheServiceImpl.updateCacheBean(userBean));
    }


    @PostMapping("del-CacheBean/{userId}")
    @ApiOperation(value = "删除delCacheBean")
    public BaseResult<Boolean> delCacheBean(@PathVariable String userId){
        userCacheServiceImpl.delCacheBean(userId);
        return BaseResult.success(true);
    }

}
