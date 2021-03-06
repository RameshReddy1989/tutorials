package com.baeldung.hexagonalexample.ports;

import java.util.List;

import com.baeldung.hexagonalexample.domain.Material;

public interface PricingRepo {

	public Material persistMaterial(Material material);

	public Material updateMaterial(Material material);

	public List<Material> getAllMaterials();

}
