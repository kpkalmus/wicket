### Projekt
Dies ist ein Demoprojekt für Wicket.
Die zugehörige Pärsentation ist [hier](https://docs.google.com/presentation/d/1HnK2T89E01Bcei3w1GI752VGq7lc0QzncyFAZ6DLPO4/edit?usp=sharing) zu finden.
Das Tutorial zeigt, wie die Übung in der Präsentation zu lösen ist.

### Tutorial

* Neues Package "com.tinf15b2.wicket.components.panels" erstellen.
* Neue Klasse "HalloDuDaPanel" erstellen.
* Code schreiben:

```java

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

```

* HTML-Dokument "HalloDuDa.html" im selben Package erstellen.
* HTML schreiben:

```html

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:wicket="http://wicket.apache.org/dtds.data/wicket-xhtml1.3-strict.dtd"
	  lang="de">
<head>
    <wicket:head>
  		<wicket:link>
  		</wicket:link>
	</wicket:head>
</head>
<body>
	<wicket:panel>
		<span>Hallo </span><span wicket:id="name"></span>
		<form wicket:id="form">
			Wie ist dein Name? <input wicket:id="text-field" />
			<br />
			<button wicket:id="button">Submit</button>
		</form>
	</wicket:panel>
</body>
</html>

```

* Das Panel in der HomePage und HelloWorldPage einfügen.
* In den Java-Klassen hinzufügen:

```java

add(new HalloDuDaPanel("hallo"));

```

* In den HTML-Dateien hinzufügen:

```html

<div wicket:id="hallo"></div>

```

* Anwendung mit Tomcat starten.
* Im Browser "localhost:8080/wicket/" aufrufen.