
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






