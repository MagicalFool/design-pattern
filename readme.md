### 设计模式

设计模式，听起来条条框框，觉得没什么用，
但是不会设计模式编程跟使用设计模式编程感觉是拿到外功心法没有内功心法一样修炼效率很低
作为菜鸟我必须要把23种模式搞清楚

---
#### 模式一：静态工厂模式
三部分组成: \
1.零件对象(车轮wheel) \
2.工厂（造车轮厂CreateWheelFactory） \
3.客户 (client)

顾名思义客户要啥给造什么零件，但是零件比较单一只有一种

---

#### 模式二：抽象工厂模式
相当于工厂模式的扩展
我不只有造轮子工厂，我还可以造车灯

组成部分

1.零件对象(车轮wheel) \
2.零件对象(车灯light) \
3.工厂1（造车轮厂CreateWheelFactory） \
4.工厂2 (造灯厂CreateLightFactory) \
3.客户 (client)