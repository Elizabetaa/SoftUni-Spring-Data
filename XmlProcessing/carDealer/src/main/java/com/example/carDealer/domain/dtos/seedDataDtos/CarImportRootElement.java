package com.example.carDealer.domain.dtos.seedDataDtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cars")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarImportRootElement {

    @XmlElement(name = "car")
    private List<CarImportDto> cars;

    public CarImportRootElement() {
    }

    public List<CarImportDto> getCars() {
        return cars;
    }

    public void setCars(List<CarImportDto> cars) {
        this.cars = cars;
    }
}
