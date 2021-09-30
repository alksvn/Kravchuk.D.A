# -- coding: utf-8 --
D = int(input("Введите год: "))
def year(D):
    if (D % 4 == 0 or D % 400 == 0) and D % 100 != 0:
        return 'Да'
    else:
        return 'Нет'
print(year(D))
input()
