## 基本使用

**本项目采用JDK17环境开发的，必须要使用JDK11以上才能运行此项目！**

本地安装 mvn clean install  其他项目就可以使用了
```xml
<dependency>
   <groupId>com.mmg</groupId>
   <artifactId>ddddocr4j</artifactId>
   <version>1.0</version>
</dependency>
```

下面是简单的示例代码

```java
import com.mmg.ddddocr4j.utils.DDDDOcrUtil;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String code = DDDDOcrUtil.getCode(new FileInputStream("验证码图片路径地址"));
        System.out.println(code);
        String base64Code = DDDDOcrUtil.getCode("base64");
        System.out.println(base64Code);
    }
}
```
