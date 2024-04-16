package accio.com.example.taxiride.transformer;


import accio.com.example.taxiride.Models.Coupon;

public class CouponTransformer {

    public static Coupon couponToTransformer(String coupon,int discount){

        return Coupon.builder()
                .coupenCode(coupon)
                .percentageDiscount(discount)
                .build();
    }
}
