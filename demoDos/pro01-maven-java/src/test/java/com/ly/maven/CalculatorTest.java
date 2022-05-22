package com.ly.maven;

import org.junit.Test;
//静态导入 表示把该类的静态代码都导入到本类中，使用静态方法不需要写类名了
import static org.junit.Assert.*;
/**
 * @Author : Ly
 * @Date : 2022/5/22
 * @Description :
 */
public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int ret = calculator.cal(3,5);
	int expectRet = 8;
	assertEquals(expectRet,ret);
	System.out.println("method have bend call");
    }
}
