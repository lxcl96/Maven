package com.ly.maven;

import org.junit.Test;
//��̬���� ��ʾ�Ѹ���ľ�̬���붼���뵽�����У�ʹ�þ�̬��������Ҫд������
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
