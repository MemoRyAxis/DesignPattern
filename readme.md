
设计模式
===

1 接口型模式
---

#### 1.1 适配器模式(Adapter)
适配器模式是将一个类的接口转换为客户端所期待的另一种接口 使原本因接口不匹配而无法在一起工作的两个类能够在一起工作

Roles : Target, Adapter, Adaptee

#### 1.2 外观模式(Facade)
外观模式是为多个复杂的子系统之间调用提供一个统一的入口 以降低客户端与子系统之间的耦合

Roles : Facade, SubSystem

#### 1.3 合成模式(Composite)
合成模式将整体和部分的关系以树结构表示出来 能够使客户端能够将对象和组合成的对象统一看待 具体分有安全方式及透明方式

Roles : Component, Composite, Leaf

#### 1.4 桥接模式(Bridge)
将抽象与行为实现解耦 从而保证各部分的独立性及可扩展性

Roles : Abstraction, Refined Abstraction, Implementor, Concrete Implementor

2 职责型模式
---

#### 2.1 单例模式(Singleton)
意图是为了确保一个类有且只有一个实例 并为它提供一个全局访问点 这里需要重点考虑的是延时加载以及线程安全问题

#### 2.2 观察者模式(Observer)
也可称主题-订阅模式(Publish/Subscribe) 具体表现为一个一对多的依赖关系 当主题对象在状态上发生变化时 其观察者会接收到通知或进行自动更新等

Roles : Subject, Concrete Subject, Observer, Concrete Observer

#### 2.3 调停者模式(Mediator)
定义一个对象 封装一组对象的交互 从而降低这些对象之间的耦合 避免了这些对象间的显示引用 并且可以独立改变对象的行为

Roles : Colleague, Mediator, Concrete Mediator

#### 2.4 代理模式(Proxy)
通过代理角色来控制一个对象的访问 代理类与委托类相互对应 并实现共同的接口 代理类中方法通过调用委托类方法来实现 并在此基础上实现增强

Roles : Subject, Real Subject, Proxy,

#### 2.5 动态代理(Dynamic Proxy)
动态生成代理类 并非直接实例化代理类 也没有直接实现委托类的接口 而是以反射直接抽取接口内的方法

Roles : Subject Real Subject, InvocationHandler, Proxy

#### 2.6 职责链模式(Chain of Responsibility, CoR)
客户端发出一个请求 同时有多个对象能够处理这个请求 为避免客户端与这些对象的耦合 将这些对象连成一条链 请求沿着这条链传递直到能够处理该请求
    
#### 2.7 享元模式(Flyweight)
通过共享的方式来实现对大量细粒度的对象的调用

Roles : Flyweight Factory, Flyweight, Flyweight Concrete

3 构建型模式
---

#### 3.1 建造者模式(Builder)
将复杂的对象构建逻辑从对象本身中抽离出来 简化对象构建过程 

Roles : Product, Concrete Product, Builder, Concrete Builder, Director

#### 3.2 工厂模式(Simple Factory, Factory)    
实际上是一个创建对象的接口 并能够控制返回实例的类型

Roles : Factory(Factory), Factory Concrete, Product, Product Concrete

#### 3.3 抽象工厂模式(Abstract Factory) 
通过一个工厂等级结构可以创建出多个不同等级的一个产品族的所有对象 有着更好的封装性 但产品族扩展不方便

Roles : Factory, Factory Concrete, Product, Product Concrete

#### 3.4 原型模式(Prototype)
通过复制现有对象来生成新的对象 具体操作为对象的克隆 分为浅表克隆和深度克隆

#### 3.5 备忘录模式(Memento)
利用一个对象来存储另一个对象的内部状态的快照 其过程不破坏被存储对象封装 并且能够在合适的时候将被存储对象状态还原

Roles : Originator, Memento, Caretaker


