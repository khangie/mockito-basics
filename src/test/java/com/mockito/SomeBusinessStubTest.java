package com.mockito;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mockito.DataService;
import com.mockito.SomeBusinessImpl;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24, 6, 15};
	}
	
}