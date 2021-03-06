package edu.dlut.catmall.authserver.feign;

import edu.dlut.catmall.authserver.vo.UserRegisterVO;
import edu.dlut.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @AUTHOR: raymond
 * @DATETIME: 2020/5/17  21:02
 * DESCRIPTION:
 **/
@FeignClient("mall-member")
public interface MemberFeign {

    @PostMapping("/member/member/register")
    R register(@RequestBody UserRegisterVO userRegisterVO);

}
