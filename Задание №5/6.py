# -- coding: utf-8 --
S = int(input('Введите целое положительное число: '))
c = 0
sum = 0
while S > 0:
   c += 1
   sum += S
   S = int(input('Введите целое положительное число: '))
else:
   print('Среднее значение:', sum / c)