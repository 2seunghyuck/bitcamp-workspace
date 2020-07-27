#include <stdio.h>
#include <stdlib.h>

int main() {
  int i[3];
  
  i[0] = 100;
  i[1] = 200;
  i[2] = 300;
  
  printf("%d, %d, %d\n", i[0], i[1], i[2]);
  
  int *p;
  
  //p = &i[0];
  p = i;
  printf("%d\n", *(p + 3));
  
  //byte * p2 = (byte*)malloc(12); 할당된 주소를 바이트단위로 사용.
  int* p2 = (int*)malloc(12); // 할당된 주소를 int(4byte) 단위로 사용.

  *p2= 110;
  *(p2 + 1) = 220;
  *(p2 + 2) = 330;
  printf("%d, %d, %d\n", *(p2 + 0), *(p2 + 1), *(p2 + 2));
  printf("%d, %d, %d\n", p2[0], p2[1], p2[2]); // 배열 지정을하지 않아도 배열처럼 사용할 수 있다.
  
  printf("%d\n", *(p2 + 3));
  printf("%d\n", *(p2 + 14));
  
  free(p2);// malloc 으로 주소를 할당 받은경우, 사용이 끝난후 주소를 반납해줘야한다.
          // maclloc (sizeof(int) *3) <- 만들 배열의 크기 설정
  printf("%d, %d, %d\n", *(p2 + 0), *(p2 + 1), *(p2 + 2));
  
  return 0;
}