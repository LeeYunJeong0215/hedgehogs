/*
 * This file is part of the 쨉OS++ distribution.
 *   (https://github.com/micro-os-plus)
 * Copyright (c) 2014 Liviu Ionescu.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom
 * the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
#include "stm32f4xx.h"

int main(int argc, char* argv[]) {
	RCC->AHB1ENR = 0x00000003;
	GPIOB->MODER = 0x00000000;
	GPIOB->OTYPER = 0;
	GPIOB->PUPDR = 0;
	GPIOB->OSPEEDR = 0;

	GPIOA->MODER = 0x0000010;
	GPIOA->OTYPER = 0;
	GPIOA->PUPDR = 0;
	GPIOA->OSPEEDR = 0;
	unsigned int data;

	while (1) {
		data = GPIOB->IDR;//입력받은 데이터
		if(data &(0x01 << 2)){//스위치를 눌렀을 때
			//입력받은 데이터값이 0x0004이면 포트2가 출력상태이므로
			GPIOA->ODR = 0X0004;//led1 켜짐
		}else
			GPIOA->ODR = 0X0000;//led2 켜짐

	}
}

#pragma GCC diagnostic pop

// ----------------------------------------------------------------------------
