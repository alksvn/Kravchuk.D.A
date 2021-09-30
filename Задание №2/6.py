# -- coding: utf-8 --
a = int(input("Номер столбца первой клетки: "))
b = int(input("Номер строки первой клетки: "))
c = int(input("Номер столбца второй клетки: "))
d = int(input("Номер строки второй клетки: "))
def A(a, b, c, d):
    if a in range(1, 9) and b in range(1, 9) and c in range(1, 9) and d in range(1, 9):
        if (a+b+c+d) % 2 == 0:
            return 'Да'
        else:
            return 'Нет'
    else:
        return "Введённое число должно быть от 1 до 8"
print(A(a, b, c, d))
input()
