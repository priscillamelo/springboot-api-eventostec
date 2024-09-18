package ufrn.eaj.tads.springbootapieventostec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.eaj.tads.springbootapieventostec.domain.coupon.Coupon;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
