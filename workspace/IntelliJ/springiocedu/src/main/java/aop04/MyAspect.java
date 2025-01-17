package aop04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect{
	@Before("execution(public int aop04.*.*())")
	public void b(JoinPoint joinPoint) {
		System.out.println("Before");
	}
	
	@After("execution(public int aop04.*.*())")
	public void a(JoinPoint joinPoint) {
		System.out.println("After");
	}

	@Around("execution(public int aop04.*.*())")
	public Object around(ProceedingJoinPoint jp) {
		System.out.println("Before Around");
		Object obj = null;
		try {
			obj = jp.proceed();
			System.out.println("Around 리턴 값 : "+obj);
		} catch(Throwable e) {
			System.out.println("Around 예외 발생 : "+e.getMessage());
		}
		if (obj == null)
			obj = new Integer(0);
		System.out.println("After Around");
		return obj;
	}
	@AfterThrowing(pointcut="execution(public int aop04.*.*())", throwing="e" )
	public void at(Throwable e){
		System.out.println("AfterThrowing : " + e.getMessage());
	}

	@AfterReturning(pointcut="execution(public int aop04.*.*())", returning="ret" )
	public void ar(Object ret){
		System.out.println("AfterReturning : " + ret);
	}

	@Before("execution(* *.work2()))")
	public void b1(JoinPoint joinPoint) {
		System.out.println("Before-b1");
	}
	@Before("execution(* *.work3()))")
	public void b2(JoinPoint joinPoint) {
		System.out.println("Before-b2");
	}
}







