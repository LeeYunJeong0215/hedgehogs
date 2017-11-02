/*
 * This file is part of the µOS++ distribution.
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

 ��ƮC�� �� 2�� ����� LD1�� �����̰� �Ѵ�.
 */

/*���� ���������� �ּ�*/
#define RCC_AHB1ENR (*(volatile unsigned long*)0x40023830) //RCC_AHB1 GPIO clock enable
#define GPIOC_MODER (*(volatile unsigned long*)0x40020800) //GPIOC port mode ��������
#define GPIOC_OTYPER (*(volatile unsigned long*)0x40020804) //GPIOC output type ��������
#define GPIOC_OSPEEDR (*(volatile unsigned long*)0x40020808) //GPIOC output speed ��������
#define GPIOC_PUPDR (*(volatile unsigned long*)0x4002080C) //GPIOC pull-up/pull-down ��������
#define GPIOC_ODR (*(volatile unsigned long*)0x40020814) //GPIOC ��·�������

/*������ƾ*/
void ms_delay_int_count(volatile unsigned int nTime) {

	nTime = (nTime * 14000); //1ms���� �Ǵ� ��, �� ���� 1ms�� �ȵǸ� Ŭ���� �̻� �ִ°�.
	for (; nTime > 0; nTime--)
		;
}

/*�ޟڷ�ƾ*/
int main(int argc, char* argv[]) {
	/*GPIO�ʱ�ȭ(�� ���������� ��)*/
	RCC_AHB1ENR = 0x00000004; //GPIOC�� RCC clock ����
	GPIOC_MODER = 0x00000010; //GPIOC(2)�� general purpose output mode��
	GPIOC_OTYPER = 0; //GPIOC(2)�� output push-pull
	GPIOC_PUPDR = 0;
	GPIOC_OSPEEDR = 0; //GPIOC(2)�� low speed��
			/*�ޟڷ�ƾ���� �ϴ� ��*/
	while (1) {
		GPIOC_ODR = 0x0004; //LD1 off
		ms_delay_int_count(100); //100 ms
		GPIOC_ODR = 0x0000; //LD1 on
		ms_delay_int_count(100); //100 ms
	}
}
