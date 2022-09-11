package com.godoro.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import static com.godoro.xml.XmUtilities.*;

public class XmlBuildList {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\karab\\Exam.xml";
		Document document = parse(path);

		Element exam = document.getDocumentElement();
		String id = getAttribute(exam, "id", "0");
		String title = getAttribute(exam, "title", "0");
		System.out.println(id+" : "+title);

		NodeList questions = exam.getElementsByTagName("question");
		for (int i = 0; i < questions.getLength(); i++) {
			Element question = (Element) questions.item(i);
			String number = getAttribute(question, "number", "");
			String text = getSingleElementText(question, "text", "");
			System.out.println(number + ". " + text);
			NodeList options = question.getElementsByTagName("option");
			for (int j = 0; j < options.getLength(); j++) {
				Element option = (Element) options.item(j);
				String code = getAttribute(option, "code", "");
				String content = option.getTextContent();
				System.out.println("Düzgü: \t" + code + ") " + content);

			}

		}
	}

}
