# DDD代码示例
## 项目架构

代码由COLA生成，参考: [Alibaba COLA 4.0](https://github.com/alibaba/COLA), [Blog](https://blog.csdn.net/significantfrank/article/details/110934799)

![ddd-architecture.png](ddd-architecture.png)

### api(or client)
- 对外接口定义

### application
- 主要做服务编排，业务逻辑下沉到 domain
- 事物处理

### domain
- 主要业务逻辑处理，六边形架构or洋葱架构最中间的一层
- 不依赖infrastructure具体实现，依赖抽象（抽象定义在domain层，实现在infrastructure层）
- 领域服务:
  * 执行一个显著的业务过程
  * 对领域对象进行转换
  * 以多个领域对象作为输入进行计算，结果产生一个值对象

### infrastructure
- 通过**依赖倒置**方式实现业务与技术实现分离（domain层作为上层模块，不依赖于下层的infrastructure层，这样就避免了MVC分层架构中的依赖问题，保留了抽象（领域模型）的稳定性的同时，并提供了基础设施的灵活性）
- 工厂技术实现
- 资源库（MySQL、Mongo...）
- 集成限界上下文（REST、RPC、消息）