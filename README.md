# ApiResponse

A simple, reusable API response builder for Spring applications.  
Provides a chainable API for constructing responses and ensures all timestamps are recorded in UTC.

![JDK](https://img.shields.io/badge/JDK-17+-green)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-blue)

<br>

## 📦 Dependency

### Maven
```xml
<dependency>
  <groupId>io.github.benchpress200</groupId>
  <artifactId>api-response</artifactId>
  <version>0.0.2</version>
</dependency>
```

### Gradle - Kotlin
```kotlin
implementation("io.github.benchpress200:api-response:0.0.2")
```

### Gradle - Groovy
```groovy
implementation 'io.github.benchpress200:api-response:0.0.2'
```

<br>

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
            .message("Success")
            .data(new User(1, "ian"))
            .build();
    }
}
```

### Response Body

```json
{
  "status": 200,
  "message": "Request successful",
  "data": {
    "id": 1,
    "name": "ian"
  },
  "timestamp": "2025-05-03T12:00:00Z"
}
```


