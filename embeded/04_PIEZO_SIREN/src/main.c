#include "stm32f4xx.h"

int main() {
	RCC->AHB1ENR = 0x00000002;
	GPIOB->MODER = 0x40000000;
	GPIOB->OTYPER = 0;
	GPIOB->PUPDR = 0;
	GPIOB->OSPEEDR = 0;
//���η�ƾ
	unsigned int period, buf;
	while (1) {

		for (period = 0x1000; period >= 1; period--) {//���� ������ �ǰ�
			GPIOB->ODR = 0x8000;
			buf = period;
			while (buf--)
				;

			GPIOB->ODR = 0x0000;
			buf = period;
			while (buf--)
				;

		}
	}

}

#pragma GCC diagnostic pop

// ----------------------------------------------------------------------------
