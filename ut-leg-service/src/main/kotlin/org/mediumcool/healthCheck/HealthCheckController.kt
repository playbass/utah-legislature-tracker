package org.mediumcool.healthCheck

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

  @GetMapping("/health")
  fun health(): HealthResponse {
    return HealthResponse(response = "We're up")
  }
}