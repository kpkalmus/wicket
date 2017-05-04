package com.tinf15b2.wicket.components.panels;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class HalloDuDaPanel extends Panel {

	public HalloDuDaPanel(String id) {
		super(id);

		IModel<String> myModel = Model.of("Du Da");
		
		Form<String> form = new Form<String>("form", myModel) {
			
			@Override
			protected void onSubmit() {
				super.onSubmit();
				if(getModelObject() == null) {
					setModelObject("Du Da");
				}
			}
			
		};

		TextField<String> textField = new TextField<>("text-field", myModel);
		
		Button button = new Button("button");
		
		Label name = new Label("name", myModel);
		
		form.add(textField);
		form.add(button);
		
		add(name);
		add(form);
	}

}