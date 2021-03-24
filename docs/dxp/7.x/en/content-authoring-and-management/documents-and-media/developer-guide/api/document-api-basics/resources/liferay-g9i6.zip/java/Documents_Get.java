import com.liferay.headless.delivery.client.dto.v1_0.Document;
import com.liferay.headless.delivery.client.pagination.Page;
import com.liferay.headless.delivery.client.pagination.Pagination;
import com.liferay.headless.delivery.client.resource.v1_0.DocumentResource;

public class Documents_Get {

	/**
	 * java -classpath .:* -DsiteId=1234 Documents_Get
	 */
	public static void main(String[] args) throws Exception {
		DocumentResource.Builder builder = DocumentResource.builder();

		DocumentResource documentResource = builder.authentication(
			"test@liferay.com", "test"
		).build();

		Page<Document> page = documentResource.getSiteDocumentsPage(
			Long.valueOf(System.getProperty("siteId")), null, null, null, null,
			Pagination.of(1, 2), null);

		System.out.println(page.getItems());
	}

}