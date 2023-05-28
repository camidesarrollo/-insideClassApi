package com.springboot.insideClass.logisticRegression;
import weka.classifiers.functions.Logistic;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.util.ArrayList;

public class CalificarAlumno {

    private Logistic classifier;

    public void train() throws Exception {
        // cargar datos de entrenamiento
        DataSource source = new DataSource("students.arff");
        Instances data = source.getDataSet();

        // definir variable de clase
        data.setClassIndex(data.numAttributes() - 1);

        // entrenar modelo
        classifier = new Logistic();
        classifier.buildClassifier(data);
    }

    public double predict(double age, double math_grade, double science_grade, double literature_grade) {
        try {
            ArrayList<Attribute> attributes = new ArrayList<>();
            attributes.add(new Attribute("age"));
            attributes.add(new Attribute("math_grade"));
            attributes.add(new Attribute("science_grade"));
            attributes.add(new Attribute("literature_grade"));

            ArrayList<String> classValues = new ArrayList<>();
            classValues.add("yes");
            classValues.add("no");
            attributes.add(new Attribute("repetition", classValues));

            Instances data = new Instances("TestInstance", attributes, 1);
            data.setClassIndex(data.numAttributes() - 1);

            DenseInstance instance = new DenseInstance(5);
            instance.setValue(attributes.get(0), age);
            instance.setValue(attributes.get(1), math_grade);
            instance.setValue(attributes.get(2), science_grade);
            instance.setValue(attributes.get(3), literature_grade);
            data.add(instance);

            return classifier.distributionForInstance(data.firstInstance())[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }
}
