#269. Даны натуральное число n, символы s1 ... sn.
#Группы символов, разделенные пробелами (одним или несколькими) 
#и не содержащие пробелов внутри себя, будем называть словами.
sequence = input("введите данные:")
j = 0
a_counter = 0
first_b_counter = 0
first_a_word = 0
public = 0
print(sequence)
blocks = sequence.split(" ")
shortest_word = len(blocks[0])
#а) Подсчитать количество слов в данной последовательности.
dlina = len(blocks)
print(f"количество слов: {dlina}")
#б) Подсчитать количество букв а в последнем слове данной последовательности.
for i in blocks[-1]:
    if i == "а" or i == "А":
        a_counter += 1
print(f"количество 'a' в последнем слове: {a_counter}")
#в) Найти количество слов, начинающихся с буквы б.
for i in blocks:
    if i[0] == "б" or i[0] == "Б":
        first_b_counter += 1
#д) Найти какое-нибудь слово, начинающееся с буквы а.
    elif i[0] == "а" or i[0] == "А":
        first_a_word = i
#ж) Найти длину самого короткого слова.
    elif len(i) < shortest_word:
        shortest_word = len(i)
#е) Преобразовать данную последовательность, 
#заменяя всякое вхождение слова это на слово то.
    if i == "это":
        blocks.pop(j)
        blocks.insert(j, "то")
    else:
        j += 1
print(f"количество слов начинающихся на 'б': {first_b_counter}")
print(f"слово начинающееся на 'а': {first_a_word}")
print(f"самое короткое слово имеет {shortest_word} символа")
public = " ".join(blocks)
print(f"данные после всех операций: {public}")
#г) Найти количество слов, у которых первый и последний символы совпадают между собой.