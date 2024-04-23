package com.spring.boot.controller;

import com.spring.boot.dto.response.PermissionResponse;
import com.spring.boot.dto.resquest.ApiResponse;
import com.spring.boot.dto.resquest.PermissionRequest;
import com.spring.boot.service.PermissionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissions")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class PermissionController {
    PermissionService permissionService;

    @PostMapping("")
    ApiResponse<PermissionResponse> createPermission(@RequestBody PermissionRequest permissionRequest) {
        return ApiResponse.<PermissionResponse>builder()
                .result(permissionService.create(permissionRequest))
                .build();
    }

    @GetMapping("/listPermission")
    ApiResponse<List<PermissionResponse>> listPermission() {
        return ApiResponse.<List<PermissionResponse>>builder()
                .result(permissionService.getAll())
                .build();
    }

    @DeleteMapping("/{permissionName}")
    ApiResponse<String> deletePermission(@PathVariable("permissionName") String permissionName) {
        permissionService.delete(permissionName);

        return ApiResponse.<String>builder()
                .result("Permission has been deleted")
                .build();
    }

}
