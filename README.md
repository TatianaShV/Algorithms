# Задачи на программирование
## Числа Фиббоначи
1. [***Найти небольшое число Фибоначчи***](https://github.com/TatianaShV/Algorithms/blob/main/fibonnachi/src/Task1.java)

Дано целое число  1 ≤ n ≤ 40, необходимо вычислить n-е число Фибоначчи (напомним, что F0 = 0, F1 = 1, Fn = F(n-1) + F(n-2)
при n ≥ 2).

2. [***Найти последнюю цифру большого числа Фибоначчи*** ](https://github.com/TatianaShV/Algorithms/blob/main/fibonnachi/src/Task2.java)

Дано число 1≤n≤10^7, необходимо найти последнюю цифру n-го числа Фибоначчи. 
Как мы помним, числа Фибоначчи растут очень быстро, поэтому при их вычислении нужно быть аккуратным с переполнением. В данной задаче, впрочем, этой проблемы можно избежать, поскольку нас интересует только последняя цифра числа Фибоначчи: если
0 ≤ a,b ≤ 9 — последние цифры чисел Fi и Fi-1 соответственно, то (a+b)mod10 — последняя цифра числа Fi+2. 

3. [***Найти огромное число Фибоначчи по модулю***](https://github.com/TatianaShV/Algorithms/blob/main/fibonnachi/src/Task3.java)
 
Даны целые числа 1 ≤ n ≤ 10^18 и 2 ≤ m ≤ 10^5, необходимо найти остаток от деления n-го числа Фибоначчи на m.
## [Наибольший общий делитель](https://github.com/TatianaShV/Algorithms/blob/main/GCD/src/Main.java)

По данным двум числам 1 ≤ a,b ≤ 2 * 10^9 найдите их наибольший общий делитель.

## Жадные алгоритмы
1.  [***Покрыть отрезки точками***](https://github.com/TatianaShV/Algorithms/blob/main/GreedyAlgorithms/src/GreedyAlgorithms1.java)

По данным n отрезкам необходимо найти множество точек минимального размера, для которого каждый из отрезков содержит хотя бы одну из точек.
В первой строке дано число 1 ≤ n ≤ 100 отрезков. Каждая из последующих n строк содержит по два числа 0 ≤ l ≤ r ≤ 10^9, задающих начало и конец отрезка. Выведите оптимальное число
m точек и сами m точек. Если таких множеств точек несколько, выведите любое из них.

2. [***Непрерывный рюкзак***](https://github.com/TatianaShV/Algorithms/blob/main/GreedyAlgorithms/src/ContinuousBackpack.java)

Первая строка содержит количество предметов 1 <= n <= 10^3 и вместимость рюкзака 0≤ W ≤2 * 10^6. Каждая из следующих n строк задаёт стоимость 0 ≤ ci ≤2 * 10^6
и объём 0 < wi ≤ 2 * 10^6 предмета (n, W, wi, ci — целые числа). Выведите максимальную стоимость частей предметов (от каждого предмета можно отделить любую часть, стоимость и объём при этом пропорционально уменьшатся),
помещающихся в данный рюкзак, с точностью не менее трёх знаков после запятой.

3. [***Различные слагаемые***](https://github.com/TatianaShV/Algorithms/blob/main/GreedyAlgorithms/src/GreedyAlgorithms3.java)

По данному числу 1 ≤ n ≤ 10^9 найдите максимальное число k, для которого n можно представить как сумму k различных натуральных слагаемых.
Выведите в первой строке число k, во второй — k слагаемых.

4. [***Кодирование Хаффмана***](https://github.com/TatianaShV/Algorithms/blob/main/GreedyAlgorithms/src/HaffmanCoding.java)

По данной непустой строке s длины не более 10^4, состоящей из строчных букв латинского алфавита, постройте оптимальный беспрефиксный код. В первой строке выведите количество различных букв
k, встречающихся в строке, и размер получившейся закодированной строки. В следующих k строках запишите коды букв в формате "letter: code". В последней строке выведите закодированную строку.

5. [***Декодирование Хаффмана***](https://github.com/TatianaShV/Algorithms/blob/main/GreedyAlgorithms/src/HaffmanDecoding.java)

Восстановите строку по её коду и беспрефиксному коду символов.

В первой строке входного файла заданы два целых числа k и l через пробел — количество различных букв, встречающихся в строке, и размер получившейся закодированной строки, соответственно. В следующих
k строках записаны коды букв в формате "letter: code". Ни один код не является префиксом другого. Буквы могут быть перечислены в любом порядке. В качестве букв могут встречаться лишь строчные буквы латинского алфавита; каждая из этих букв встречается в строке хотя бы один раз. Наконец, в последней строке записана закодированная строка. Исходная строка и коды всех букв непусты. Заданный код таков, что закодированная строка имеет минимальный возможный размер.

В первой строке выходного файла выведите строку s. Она должна состоять из строчных букв латинского алфавита. Гарантируется, что длина правильного ответа не превосходит 10^4 символов.

6. ***Очередь с приоритетами***
   * [Через maxHeap](https://github.com/TatianaShV/Algorithms/blob/main/GreedyAlgorithms/src/MaxHeap.java)
   * [ Через minHeap](https://github.com/TatianaShV/Algorithms/blob/main/GreedyAlgorithms/src/MinHeap.java)

Первая строка входа содержит число операций 1 ≤ n ≤ 10^5. Каждая из последующих n строк задают операцию одного из следующих двух типов:

Insert x, где 0 ≤ x ≤ 10^9 — целое число;
ExtractMax. 
Первая операция добавляет число x в очередь с приоритетами, вторая — извлекает максимальное число и выводит его.

## "Разделяй и властвуй"
1.  [***Двоичный поиск***](https://github.com/TatianaShV/Algorithms/blob/main/binarySearch/src/main/java/groupId/BinarySearch.java)

В первой строке даны целое число 1 ≤ n ≤ 10^5 и массив A[1…n] из n различных натуральных чисел, не превышающих 10^9, в порядке возрастания, во второй — целое число 1 ≤ k ≤ 10^5 и k натуральных чисел b1,...bk, не превышающих 10^9. Для каждого i от 1 до k необходимо вывести индекс 1 ≤ j ≤ n, для которого A[j]=bi, или −1, если такого  j нет.
