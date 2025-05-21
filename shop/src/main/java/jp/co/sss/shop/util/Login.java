package jp.co.sss.shop.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ java.lang.annotation.ElementType.TYPE })
//실행 중에도 유지돼야 한다
@Retention(RetentionPolicy.RUNTIME)
//@Login을 쓴 클래스의 Javadoc 문서에 이 어노테이션 정보도 표시됨. 문서화용 옵션
@Documented
//'나는 유효성 검사를 LoginValidator로 할 거야'라고 선언 
@Constraint(validatedBy = { LoginValidator.class })
public @interface Login {
	String message() default "ユーザID、もしくはパスワードが間違っています。";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String fieldUserId() default "userId";

	String fieldPassword() default "password";
}
