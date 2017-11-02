#include "stm32f4xx.h"

/*������ƾ*/
void ms_delay_int_count(volatile unsigned int nTime) {

	nTime = (nTime * 14000); //1ms���� �Ǵ� ��, �� ���� 1ms�� �ȵǸ� Ŭ���� �̻� �ִ°�.
	for (; nTime > 0; nTime--)
		;
}

int main() {

	RCC->AHB1ENR = 0x00000003;
	GPIOA->MODER = 0x00001000;
	GPIOA->OTYPER = 0;
	GPIOA->PUPDR = 0;
	GPIOA->OSPEEDR = 0;

	GPIOB->MODER = 0x00005000;
	GPIOB->OTYPER = 0;
	GPIOB->PUPDR = 0;
	GPIOB->OSPEEDR = 0;

	while (1) {
		GPIOA->ODR = 0x0040;
		GPIOB->ODR = 0x0040;
		ms_delay_int_count(1000);

		GPIOA->ODR = 0x0000;
		GPIOB->ODR = 0x0040;
		ms_delay_int_count(1000);

		GPIOA->ODR = 0x0040;
		GPIOB->ODR = 0x0080;
		ms_delay_int_count(1000);

		GPIOA->ODR = 0x0000;
		GPIOB->ODR = 0x0080;
		ms_delay_int_count(1000);

	}
}
