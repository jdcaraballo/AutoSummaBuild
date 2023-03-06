package co.com.tcs.certificacion.userinterfaces.benefits;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class CheckDetailBenefitUser {
    public static final Target BTN_MODULO_BENEFICIOS=Target.the("Ingreso al módulo de Beneficios").locatedBy("//*[contains(text(),'Beneficios')]");
    public static final Target BTN_VER_HISTORICOS_BENEFICIOS=Target.the("Botón Ver Históricos ").locatedBy("//*[@class='container'] //*[contains(text(),'Ver históricos')]");
    public static final Target BTN_DEPLOY_FILTER_BENEFITS=Target.the("Campo Filtro general Beneficios").locatedBy("//*[@id='p-panel-0-titlebar']");
    public static final Target FIELD_CEDULA_BENEFITS=Target.the("Capo Filtro Cédula Beneficios").located(By.id("filter-collaboratorDocument"));
    public static final Target FIELD_FULLNAME_BENEFITS=Target.the("Capo Filtro Nombre Completo Beneficios").located(By.id("filter-collaboratorFullName"));
    public static final Target FIELD_BENEFITS_TYPE_BENEFITS=Target.the("Capo Filtro Nombre Completo Beneficios").located(By.id("filter-benefitType"));
    public static final Target FIELD_COMPANY_BENEFITS=Target.the("Capo Filtro para compañia").locatedBy("(//*[@id='filter-company'])[1]");
    public static final Target FIELD_AUXILIOS_BENEFITS=Target.the("Capo Filtro para Auxilios").locatedBy("(//*[@id='filter-company'])[2]");
    public static final Target FIELD_POLIZAS_BENEFITS=Target.the("Capo Filtro para Polizas").locatedBy("(//*[@id='filter-company'])[3]");
    public static final Target BTN_GENERAR_NOVEDADES=Target.the("Botón generar novedades Beneficios").locatedBy("//*[contains(text(),'Generar novedades')]");
    public static final Target VALIDATE_NO_BENEFITS_RECORD=Target.the("Text no Hay beneficios para ese usuario/No existe usuario").locatedBy("//*[contains(text(),'No hay datos disponibles')]");
    public static final Target CHECK_DETAILS_BENEFIT_USER=Target.the("Ver detalles del Beneficio Seleccionado").locatedBy("//*[@ptooltip='Ver detalle']");
    public static final Target VALIDATE_VIEW_DETAIL_BENEFIT=Target.the("VAlidación de VIew Detail Benefit").locatedBy("//*[contains(text(),'Detalle del registro')]");
}