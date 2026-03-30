
package org.api.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.api.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CadastrarCliente_QNAME = new QName("http://ws.api.org/", "cadastrarCliente");
    private final static QName _CadastrarClienteResponse_QNAME = new QName("http://ws.api.org/", "cadastrarClienteResponse");
    private final static QName _CadastrarProduto_QNAME = new QName("http://ws.api.org/", "cadastrarProduto");
    private final static QName _CadastrarProdutoResponse_QNAME = new QName("http://ws.api.org/", "cadastrarProdutoResponse");
    private final static QName _ListarClientes_QNAME = new QName("http://ws.api.org/", "listarClientes");
    private final static QName _ListarClientesResponse_QNAME = new QName("http://ws.api.org/", "listarClientesResponse");
    private final static QName _ListarProdutos_QNAME = new QName("http://ws.api.org/", "listarProdutos");
    private final static QName _ListarProdutosResponse_QNAME = new QName("http://ws.api.org/", "listarProdutosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.api.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CadastrarCliente }
     * 
     */
    public CadastrarCliente createCadastrarCliente() {
        return new CadastrarCliente();
    }

    /**
     * Create an instance of {@link CadastrarClienteResponse }
     * 
     */
    public CadastrarClienteResponse createCadastrarClienteResponse() {
        return new CadastrarClienteResponse();
    }

    /**
     * Create an instance of {@link CadastrarProduto }
     * 
     */
    public CadastrarProduto createCadastrarProduto() {
        return new CadastrarProduto();
    }

    /**
     * Create an instance of {@link CadastrarProdutoResponse }
     * 
     */
    public CadastrarProdutoResponse createCadastrarProdutoResponse() {
        return new CadastrarProdutoResponse();
    }

    /**
     * Create an instance of {@link ListarClientes }
     * 
     */
    public ListarClientes createListarClientes() {
        return new ListarClientes();
    }

    /**
     * Create an instance of {@link ListarClientesResponse }
     * 
     */
    public ListarClientesResponse createListarClientesResponse() {
        return new ListarClientesResponse();
    }

    /**
     * Create an instance of {@link ListarProdutos }
     * 
     */
    public ListarProdutos createListarProdutos() {
        return new ListarProdutos();
    }

    /**
     * Create an instance of {@link ListarProdutosResponse }
     * 
     */
    public ListarProdutosResponse createListarProdutosResponse() {
        return new ListarProdutosResponse();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "cadastrarCliente")
    public JAXBElement<CadastrarCliente> createCadastrarCliente(CadastrarCliente value) {
        return new JAXBElement<CadastrarCliente>(_CadastrarCliente_QNAME, CadastrarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "cadastrarClienteResponse")
    public JAXBElement<CadastrarClienteResponse> createCadastrarClienteResponse(CadastrarClienteResponse value) {
        return new JAXBElement<CadastrarClienteResponse>(_CadastrarClienteResponse_QNAME, CadastrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProduto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarProduto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "cadastrarProduto")
    public JAXBElement<CadastrarProduto> createCadastrarProduto(CadastrarProduto value) {
        return new JAXBElement<CadastrarProduto>(_CadastrarProduto_QNAME, CadastrarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProdutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarProdutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "cadastrarProdutoResponse")
    public JAXBElement<CadastrarProdutoResponse> createCadastrarProdutoResponse(CadastrarProdutoResponse value) {
        return new JAXBElement<CadastrarProdutoResponse>(_CadastrarProdutoResponse_QNAME, CadastrarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarClientes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "listarClientes")
    public JAXBElement<ListarClientes> createListarClientes(ListarClientes value) {
        return new JAXBElement<ListarClientes>(_ListarClientes_QNAME, ListarClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarClientesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "listarClientesResponse")
    public JAXBElement<ListarClientesResponse> createListarClientesResponse(ListarClientesResponse value) {
        return new JAXBElement<ListarClientesResponse>(_ListarClientesResponse_QNAME, ListarClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProdutos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProdutos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "listarProdutos")
    public JAXBElement<ListarProdutos> createListarProdutos(ListarProdutos value) {
        return new JAXBElement<ListarProdutos>(_ListarProdutos_QNAME, ListarProdutos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProdutosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProdutosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.api.org/", name = "listarProdutosResponse")
    public JAXBElement<ListarProdutosResponse> createListarProdutosResponse(ListarProdutosResponse value) {
        return new JAXBElement<ListarProdutosResponse>(_ListarProdutosResponse_QNAME, ListarProdutosResponse.class, null, value);
    }

}
