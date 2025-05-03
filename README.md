# ApiResponse

A simple, reusable API response builder for Spring applications.  
Supports fluent-style building and UTC timestamps.

![JDK](https://img.shields.io/badge/JDK-17+-green)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-blue)

## 📦 Dependency

### Maven
```xml
<dependency>
  <groupId>io.github.benchpress200</groupId>
  <artifactId>api-response</artifactId>
  <version>0.0.2</version>
</dependency>
```

### Gradle (Kotlin DSL)
```kotlin
implementation("io.github.benchpress200:api-response:0.0.2")
```

### Gradle (Groovy DSL)
```groovy
implementation 'io.github.benchpress200:api-response:0.0.2'
```

## 🚀 Usage
### Example: REST Controller
```java
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.benchpress200.apiresponse.ApiResponse;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ApiResponse.builder()
            .status(HttpStatus.OK)
            .message("Request successful")
            .data("Hello, World!")
            .build();
    }
}
```

### Response Body
```json
{
  "status": 200,
  "message": "Request successful",
  "data": "Hello, World!",
  "timestamp": "2025-05-03T12:00:00Z"
}
```


