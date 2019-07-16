package it.polito.dp2.NFV.sol3.client2;

import it.polito.dp2.NFV.VNFTypeReader;
import it.polito.dp2.NFV.FunctionalType;

public class VNFTypeReaderClass implements VNFTypeReader {
	VnftType vnft;
	
	public VNFTypeReaderClass(VnftType vnft){
		this.vnft=vnft;
	}
	@Override
	public String getName() {
		if(vnft==null)
			return null;
		return vnft.getName();
	}

	@Override
	public FunctionalType getFunctionalType() {
		if(vnft==null)
			return null;
		return FunctionalType.fromValue(vnft.getFuncType().value());
	}

	@Override
	public int getRequiredMemory() {
		return vnft.getMemory();
	}

	@Override
	public int getRequiredStorage() {
		return vnft.getDiskStorage();
	}

}
