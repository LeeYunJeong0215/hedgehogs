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


/*
 01_LD1 ON_OFF

 포트C의 핀 2에 연결된 LD1을 깜박이게 한다.
 */

/*관계 레지스터의 주소*/
#define RCC_AHB1ENR (*(volatile unsigned long*)0x40023830) //RCC_AHB1 GPIO clock enable
#define GPIOC_MODER (*(volatile unsigned long*)0x40020800) //GPIOC port mode 레지스터
#define GPIOC_OTYPER (*(volatile unsigned long*)0x40020804) //GPIOC output type 레지스터
#define GPIOC_OSPEEDR (*(volatile unsigned long*)0x40020808) //GPIOC output speed 레지스터
#define GPIOC_PUPDR (*(volatile unsigned long*)0x4002080C) //GPIOC pull-up/pull-down 레지스터
#define GPIOC_ODR (*(volatile unsigned long*)0x40020814) //GPIOC 출력레지스터

/*지연루틴*/
void ms_delay_int_count(volatile unsigned int nTime) {

	nTime = (nTime * 14000); //1ms정도 되는 값, 이 값이 1ms가 안되면 클럭이 이상 있는것.
	for (; nTime > 0; nTime--)
		;
}

/*메읶루틴*/
int main(int argc, char* argv[]) {
	/*GPIO초기화(각 레지스터의 값)*/
	RCC_AHB1ENR = 0x00000004; //GPIOC에 RCC clock 공급
	GPIOC_MODER = 0x00000010; //GPIOC(2)를 general purpose output mode로
	GPIOC_OTYPER = 0; //GPIOC(2)는 output push-pull
	GPIOC_PUPDR = 0;
	GPIOC_OSPEEDR = 0; //GPIOC(2)를 low speed로
			/*메읶루틴에서 하는 읷*/
	while (1) {
		GPIOC_ODR = 0x0004; //LD1 off
		ms_delay_int_count(100); //100 ms
		GPIOC_ODR = 0x0000; //LD1 on
		ms_delay_int_count(100); //100 ms
	}
}
