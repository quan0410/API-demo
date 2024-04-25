package com.spring.boot.dto.resquest;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder@FieldDefaults(level = AccessLevel.PRIVATE)
public class RefreshRequest {
    String token;
}
