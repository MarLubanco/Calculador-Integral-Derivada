package br.com.calculo.controller;

import br.com.calculo.model.Integral;
import br.com.calculo.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/integral")
public class IntegralController {

  @Autowired
  private IntegralService integralService;

  @PostMapping
  private Integral save(@RequestBody Integral integral) {
    return integralService.save(integral);
  }

  @GetMapping("{id}")
  private Optional<Integral> getIntegral(@PathVariable("id") Long id) {
    return integralService.getIntegral(id);
  }

  @GetMapping
  private List<Integral> getAll() {
    return integralService.getAll();
  }

}
