# -- coding: utf-8 --
age = int(input("Введите свой возраст "))
name = str(input("Введите Ваше имя "))
if (name != "Иван") and  age >=16  :
    print("Поздравляем вы поступили в ВГУИТ")
if  age <16  and name != "Иван":
    print("Сначала нужно окончить школу!")
if name == "Иван":
    print("Не удовлетворяет условию")
input()
