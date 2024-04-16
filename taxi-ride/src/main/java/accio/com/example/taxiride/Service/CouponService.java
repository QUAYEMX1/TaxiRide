package accio.com.example.taxiride.Service;

import accio.com.example.taxiride.Models.Coupon;
import accio.com.example.taxiride.Repository.CouponRepository;
import accio.com.example.taxiride.transformer.CouponTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CouponService {

    public final CouponRepository couponRepository;

    public String addCoupon(String coupon,int discount){

        Coupon coupons= CouponTransformer.couponToTransformer(coupon, discount);

        couponRepository.save(coupons);

        return "coupon added successfully";
    }
}
