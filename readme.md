
设计模式

=====================================

1 接口型模式

-------------------------------------

1.1 适配器模式(Adapter)
    适配器模式是将一个类的接口转换为客户端所期待的另一种接口 使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
    Roles : Target, Adapter, Adaptee

1.2 外观模式(Facade)
    外观模式是为多个复杂的子系统之间调用提供一个统一的入口 以降低客户端与子系统之间的耦合
    Roles : Facade, SubSystem

1.3 合成模式(Composite)
    合成模式将整体和部分的关系以树结构表示出来 能够使客户端能够将对象和组合成的对象统一看待 具体分有安全方式及透明方式
    Roles : Component, Composite, Leaf

1.4 桥接模式(Bridge)
    将抽象与行为实现解耦 从而保证各部分的独立性及可扩展性
    Roles : Abstraction, Refined Abstraction, Implementor, Concrete Implementor

-------------------------------------

2 职责型模式

-------------------------------------

2.1 单例模式(Singleton)
    意图是为了确保一个类有且只有一个实例 并为它提供一个全局访问点 这里需要重点考虑的是延时加载以及线程安全问题

2.2 观察者模式(Observer)
    也可称主题-订阅模式(Publish/Subscribe) 具体表现为一个一对多的依赖关系 当主题对象在状态上发生变化时 其观察者会接收到通知或进行自动更新等
    Roles : Subject, Concrete Subject, Observer, Concrete Observer

2.3 调停者模式(Mediator)
    定义一个对象 封装一组对象的交互 从而降低这些对象之间的耦合 避免了这些对象间的显示引用 并且可以独立改变对象的行为
    Roles : Colleague, Mediator, Concrete Mediator

