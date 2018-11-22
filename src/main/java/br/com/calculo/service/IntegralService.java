package br.com.calculo.service;

import br.com.calculo.model.Integral;
import br.com.calculo.repository.IntegralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IntegralService {

  @Autowired
  private IntegralRepository integralRepository;

  public Integral save(Integral integral) {
    return integralRepository.save(integral);
  }

  public List<Integral> getAll() {
    return integralRepository.findAll();
  }

  public Optional<Integral> getIntegral(Long id) {
    return integralRepository.findById(id);
  }

  public void delete(Long id) {
    integralRepository.deleteById(id);
  }
}
