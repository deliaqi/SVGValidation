package demo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import cdxml.dom.CDXML;
import cdxml.dom.Fragment;
import cdxml.dom.N;

public class CDXMLTest {
	
	
	@SuppressWarnings("unchecked")
	public static <T> T readString(Class<T> cla, String context) throws JAXBException{
		System.setProperty("javax.xml.accessExternalDTD", "all");
		try {
			JAXBContext jc;
			jc = JAXBContext.newInstance(cla);
			Unmarshaller u = jc.createUnmarshaller();
			return (T)u.unmarshal(new File(context));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		
	}

	/*public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		CDXML cdxml = CDXMLTest.readString(CDXML.class, "C:\\Users\\LIUJF\\Desktop\\new\\structure.cdxml");
		System.out.println(cdxml.getCreationProgram());
		System.out.println(cdxml.getPage().size());
		System.out.println(cdxml.getBoundingBox());
		
		List<Object> fragmentlist = cdxml.getPage().get(0).getTOrFragmentOrGroup();
		Fragment f = Fragment.class.cast(fragmentlist.get(0));
		List<Object> NorBlist = f.getNOrBOrT();
		N n1 = N.class.cast(NorBlist.get(0));
		System.out.println(n1.getP());
		N n2 = N.class.cast(NorBlist.get(1));
		System.out.println(n2.getP());

	}*/

}
