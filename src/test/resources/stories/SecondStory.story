Meta:

Scenario: second scenario

When Выбран маркет
When Выбрана электроника
When Выбран раздел [Наушники]
When Задана стоимость "5000"
When Выбрать происзодителя "Beats"
Then Элементов на странице "12"

When Запомнить название [1] элемента
When Выполнен поиск сохраненного элемента
Then Титул найденного товара равен запомненному значению