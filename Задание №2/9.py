# -- coding: utf-8 --
n = int(input("Введите n(n!=m): "))
m = int(input("Введите m(m!=n): "))
k = int(input("Введите количество долек: "))
if (n * m > k) and (k % n == 0 or k % m == 0):
      print("Да")
else:
      print("Нет")
