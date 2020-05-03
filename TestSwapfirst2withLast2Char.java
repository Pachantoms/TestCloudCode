package com.learn.tdd3.tdd3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSwapfirst2withLast2Char {

	@Test
	public void testwith5char() {
		//fail("Not yet implemented");
		SwapClass swapobj = new SwapClass();
		//assertEquals()
		assertEquals("DECAB", swapobj.swapfn("ABCDE"));
		//ABCD -> CDAB
		//ABCDE -> DECAB - 
		//AB -> BA
		//"" -> ""
	}

	@Test
	public void testwith4char() {
		//fail("Not yet implemented");
		SwapClass swapobj = new SwapClass();
		//assertEquals()
		assertEquals("DEAB", swapobj.swapfn("ABDE"));
		//ABCD -> CDAB
		//ABCDE -> DECAB - 
		//AB -> BA
		//"" -> ""
	}
	
	@Test
	public void testwith2char() {
		//fail("Not yet implemented");
		SwapClass swapobj = new SwapClass();
		//assertEquals()
		assertEquals("AB", swapobj.swapfn("AB"));
		//ABCD -> CDAB
		//ABCDE -> DECAB - 
		//AB -> BA
		//"" -> ""
	}
	
	@Test
	public void testwithnochar() {
		//fail("Not yet implemented");
		SwapClass swapobj = new SwapClass();
		//assertEquals()
		assertEquals("", swapobj.swapfn(""));
		//ABCD -> CDAB
		//ABCDE -> DECAB - 
		//AB -> BA
		//"" -> ""
	}
}
