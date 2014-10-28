现用到的模板引擎都放在包uienginetemplate下，需把包copy到src下，另外在类UIEngine中修改：
1.模板属性设置（设置递归深度为40）
p.put("velocimacro.max.depth","40");
2.模板路径设置
Template template = Velocity.getTemplate("uienginetemplate/engine.vm");
加了相对路径