package ee.jakarta.tck.persistence.core.criteriaapi.CriteriaBuilder;

import ee.jakarta.tck.persistence.core.criteriaapi.CriteriaBuilder.Client6;
import java.net.URL;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.container.test.api.OverProtocol;
import org.jboss.arquillian.container.test.api.TargetsContainer;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tck.arquillian.porting.lib.spi.TestArchiveProcessor;
import tck.arquillian.protocol.common.TargetVehicle;



@ExtendWith(ArquillianExtension.class)
@Tag("persistence")
@Tag("platform")
@Tag("web")
@Tag("tck-appclient")

public class Client6AppmanagedTest extends ee.jakarta.tck.persistence.core.criteriaapi.CriteriaBuilder.Client6 {
    static final String VEHICLE_ARCHIVE = "jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle";

        /**
        EE10 Deployment Descriptors:
        jpa_core_criteriapia_CriteriaBuilder: META-INF/persistence.xml
        jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client: META-INF/application-client.xml
        jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_criteriapia_CriteriaBuilder_appmanagedNoTx_vehicle_client: META-INF/application-client.xml
        jpa_core_criteriapia_CriteriaBuilder_appmanagedNoTx_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_criteriapia_CriteriaBuilder_pmservlet_vehicle_web: WEB-INF/web.xml
        jpa_core_criteriapia_CriteriaBuilder_puservlet_vehicle_web: WEB-INF/web.xml
        jpa_core_criteriapia_CriteriaBuilder_stateful3_vehicle_client: META-INF/application-client.xml
        jpa_core_criteriapia_CriteriaBuilder_stateful3_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_criteriapia_CriteriaBuilder_stateless3_vehicle_client: META-INF/application-client.xml
        jpa_core_criteriapia_CriteriaBuilder_stateless3_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_criteriapia_CriteriaBuilder_vehicles: 

        Found Descriptors:
        Client:

        /com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_client.xml
        Ejb:

        Ear:

        */
        @TargetsContainer("tck-appclient")
        @OverProtocol("appclient")
        @Deployment(name = VEHICLE_ARCHIVE, order = 2)
        public static EnterpriseArchive createDeploymentVehicle(@ArquillianResource TestArchiveProcessor archiveProcessor) {
        // Client
            // the jar with the correct archive name
            JavaArchive jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client = ShrinkWrap.create(JavaArchive.class, "jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client.jar");
            // The class files
            jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client.addClasses(
            com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManager.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareIF.class,
            com.sun.ts.lib.harness.EETest.Fault.class,
            com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleIF.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManagerFactory.class,
            com.sun.ts.tests.common.vehicle.EmptyVehicleRunner.class,
            ee.jakarta.tck.persistence.common.PMClientBase.class,
            ee.jakarta.tck.persistence.common.schema30.Util.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
            com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleRunner.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UserTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.class,
            com.sun.ts.lib.harness.ServiceEETest.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EntityTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.SetupException.class,
            com.sun.ts.tests.common.vehicle.VehicleClient.class,
            com.sun.ts.tests.common.vehicle.ejb3share.NoopTransactionWrapper.class
            );
            // The application-client.xml descriptor
            URL resURL = Client6.class.getResource("/com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_client.xml");
            if(resURL != null) {
              jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client.addAsManifestResource(resURL, "application-client.xml");
            }
            // The sun-application-client.xml file need to be added or should this be in in the vendor Arquillian extension?
            resURL = Client6.class.getResource("//com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_client.jar.sun-application-client.xml");
            if(resURL != null) {
              jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client.addAsManifestResource(resURL, "application-client.xml");
            }
            jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client.addAsManifestResource(new StringAsset("Main-Class: " + Client6.class.getName() + "\n"), "MANIFEST.MF");
            archiveProcessor.processClientArchive(jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client, Client6.class, resURL);


        // Ejb
            // the jar with the correct archive name
            JavaArchive jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb = ShrinkWrap.create(JavaArchive.class, "jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb.jar");
            // The class files
            jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb.addClasses(
                com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareBaseBean.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManager.class,
                com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareIF.class,
                com.sun.ts.lib.harness.EETest.Fault.class,
                com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleIF.class,
                ee.jakarta.tck.persistence.core.criteriaapi.CriteriaBuilder.Client6.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManagerFactory.class,
                ee.jakarta.tck.persistence.common.PMClientBase.class,
                ee.jakarta.tck.persistence.common.schema30.Util.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
                com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleBean.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UserTransactionWrapper.class,
                com.sun.ts.lib.harness.EETest.class,
                com.sun.ts.lib.harness.ServiceEETest.class,
                com.sun.ts.tests.common.vehicle.ejb3share.EntityTransactionWrapper.class,
                com.sun.ts.lib.harness.EETest.SetupException.class,
                com.sun.ts.tests.common.vehicle.VehicleClient.class,
                com.sun.ts.tests.common.vehicle.ejb3share.NoopTransactionWrapper.class
            );
            // The ejb-jar.xml descriptor
            URL ejbResURL = Client6.class.getResource("//vehicle/appmanaged/appmanaged_vehicle_ejb.xml");
            if(ejbResURL != null) {
              jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb.addAsManifestResource(ejbResURL, "ejb-jar.xml");
            }
            // The sun-ejb-jar.xml file
            ejbResURL = Client6.class.getResource("//vehicle/appmanaged/appmanaged_vehicle_ejb.jar.sun-ejb-jar.xml");
            if(ejbResURL != null) {
              jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb.addAsManifestResource(ejbResURL, "sun-ejb-jar.xml");
            }
            archiveProcessor.processEjbArchive(jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb, Client6.class, ejbResURL);

        // Par
            // the jar with the correct archive name
            JavaArchive jpa_core_criteriapia_CriteriaBuilder = ShrinkWrap.create(JavaArchive.class, "jpa_core_criteriapia_CriteriaBuilder.jar");
            // The class files
            jpa_core_criteriapia_CriteriaBuilder.addClasses(
                ee.jakarta.tck.persistence.common.schema30.Department.class,
                ee.jakarta.tck.persistence.common.schema30.Address_.class,
                ee.jakarta.tck.persistence.common.schema30.Department_.class,
                ee.jakarta.tck.persistence.common.schema30.CreditCard.class,
                ee.jakarta.tck.persistence.common.schema30.Info.class,
                ee.jakarta.tck.persistence.common.schema30.LineItem_.class,
                ee.jakarta.tck.persistence.common.schema30.Phone.class,
                ee.jakarta.tck.persistence.common.schema30.Customer_.class,
                ee.jakarta.tck.persistence.common.schema30.Employee_.class,
                ee.jakarta.tck.persistence.common.schema30.Trim_.class,
                ee.jakarta.tck.persistence.common.schema30.Order_.class,
                ee.jakarta.tck.persistence.common.schema30.ShelfLife_.class,
                ee.jakarta.tck.persistence.common.schema30.ShelfLife.class,
                ee.jakarta.tck.persistence.common.schema30.Phone_.class,
                ee.jakarta.tck.persistence.common.schema30.Address.class,
                ee.jakarta.tck.persistence.common.schema30.Info_.class,
                ee.jakarta.tck.persistence.common.schema30.HardwareProduct.class,
                ee.jakarta.tck.persistence.common.schema30.Country_.class,
                ee.jakarta.tck.persistence.common.schema30.Alias_.class,
                ee.jakarta.tck.persistence.common.schema30.Trim.class,
                ee.jakarta.tck.persistence.common.schema30.HardwareProduct_.class,
                ee.jakarta.tck.persistence.common.schema30.CreditCard_.class,
                ee.jakarta.tck.persistence.common.schema30.SoftwareProduct.class,
                ee.jakarta.tck.persistence.common.schema30.Product.class,
                ee.jakarta.tck.persistence.common.schema30.Spouse.class,
                ee.jakarta.tck.persistence.common.schema30.SoftwareProduct_.class,
                ee.jakarta.tck.persistence.common.schema30.Spouse_.class,
                ee.jakarta.tck.persistence.common.schema30.LineItem.class,
                ee.jakarta.tck.persistence.common.schema30.Employee.class,
                ee.jakarta.tck.persistence.common.schema30.Product_.class,
                ee.jakarta.tck.persistence.common.schema30.Customer.class,
                ee.jakarta.tck.persistence.common.schema30.Alias.class,
                ee.jakarta.tck.persistence.common.schema30.Order.class,
                ee.jakarta.tck.persistence.common.schema30.LineItemException.class,
                ee.jakarta.tck.persistence.common.schema30.Country.class
            );
            // The persistence.xml descriptor
            URL parURL = Client6.class.getResource("persistence.xml");
            if(parURL != null) {
              jpa_core_criteriapia_CriteriaBuilder.addAsManifestResource(parURL, "persistence.xml");
            }
            archiveProcessor.processParArchive(jpa_core_criteriapia_CriteriaBuilder, Client6.class, parURL);
            // The orm.xml file
            parURL = Client6.class.getResource("orm.xml");
            if(parURL != null) {
              jpa_core_criteriapia_CriteriaBuilder.addAsManifestResource(parURL, "orm.xml");
            }

        // Ear
            EnterpriseArchive jpa_core_criteriapia_CriteriaBuilder_vehicles_ear = ShrinkWrap.create(EnterpriseArchive.class, "jpa_core_criteriapia_CriteriaBuilder_vehicles.ear");

            // Any libraries added to the ear

            // The component jars built by the package target
            jpa_core_criteriapia_CriteriaBuilder_vehicles_ear.addAsModule(jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_ejb);
            jpa_core_criteriapia_CriteriaBuilder_vehicles_ear.addAsModule(jpa_core_criteriapia_CriteriaBuilder_appmanaged_vehicle_client);

            jpa_core_criteriapia_CriteriaBuilder_vehicles_ear.addAsLibrary(jpa_core_criteriapia_CriteriaBuilder);



            // The application.xml descriptor
            URL earResURL = Client6.class.getResource("/com/sun/ts/tests/jpa/core/criteriaapi/CriteriaBuilder/");
            if(earResURL != null) {
              jpa_core_criteriapia_CriteriaBuilder_vehicles_ear.addAsManifestResource(earResURL, "application.xml");
            }
            // The sun-application.xml descriptor
            earResURL = Client6.class.getResource("/com/sun/ts/tests/jpa/core/criteriaapi/CriteriaBuilder/.ear.sun-application.xml");
            if(earResURL != null) {
              jpa_core_criteriapia_CriteriaBuilder_vehicles_ear.addAsManifestResource(earResURL, "sun-application.xml");
            }
            archiveProcessor.processEarArchive(jpa_core_criteriapia_CriteriaBuilder_vehicles_ear, Client6.class, earResURL);
        return jpa_core_criteriapia_CriteriaBuilder_vehicles_ear;
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void avg() throws java.lang.Exception {
            super.avg();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void max() throws java.lang.Exception {
            super.max();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void min() throws java.lang.Exception {
            super.min();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void greatest() throws java.lang.Exception {
            super.greatest();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void least() throws java.lang.Exception {
            super.least();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void count() throws java.lang.Exception {
            super.count();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void some() throws java.lang.Exception {
            super.some();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void any() throws java.lang.Exception {
            super.any();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void notPredicate() throws java.lang.Exception {
            super.notPredicate();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void conjunction() throws java.lang.Exception {
            super.conjunction();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void disjunction() throws java.lang.Exception {
            super.disjunction();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void isTrue() throws java.lang.Exception {
            super.isTrue();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void isFalse() throws java.lang.Exception {
            super.isFalse();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void equalExpObjectTest() throws java.lang.Exception {
            super.equalExpObjectTest();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void equalExpExpTest() throws java.lang.Exception {
            super.equalExpExpTest();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void notEqualExpObjectTest() throws java.lang.Exception {
            super.notEqualExpObjectTest();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void notEqualExpExpTest() throws java.lang.Exception {
            super.notEqualExpExpTest();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void abs() throws java.lang.Exception {
            super.abs();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void joinOnExpressionTest() throws java.lang.Exception {
            super.joinOnExpressionTest();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void joinOnPredicateArrayTest() throws java.lang.Exception {
            super.joinOnPredicateArrayTest();
        }


}