//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 10:18:13 AM CEST 
//


package org.fiteagle.sfa.rspec.manifest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.geni.resources.rspec._3 package. 
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

    private final static QName _ComponentHop_QNAME = new QName("http://www.geni.net/resources/rspec/3", "component_hop");
    private final static QName _Login_QNAME = new QName("http://www.geni.net/resources/rspec/3", "login");
    private final static QName _Rspec_QNAME = new QName("http://www.geni.net/resources/rspec/3", "rspec");
    private final static QName _Node_QNAME = new QName("http://www.geni.net/resources/rspec/3", "node");
    private final static QName _Ip_QNAME = new QName("http://www.geni.net/resources/rspec/3", "ip");
    private final static QName _Interface_QNAME = new QName("http://www.geni.net/resources/rspec/3", "interface");
    private final static QName _Property_QNAME = new QName("http://www.geni.net/resources/rspec/3", "property");
    private final static QName _Relation_QNAME = new QName("http://www.geni.net/resources/rspec/3", "relation");
    private final static QName _Link_QNAME = new QName("http://www.geni.net/resources/rspec/3", "link");
    private final static QName _HardwareType_QNAME = new QName("http://www.geni.net/resources/rspec/3", "hardware_type");
    private final static QName _Location_QNAME = new QName("http://www.geni.net/resources/rspec/3", "location");
    private final static QName _Services_QNAME = new QName("http://www.geni.net/resources/rspec/3", "services");
    private final static QName _Execute_QNAME = new QName("http://www.geni.net/resources/rspec/3", "execute");
    private final static QName _DiskImage_QNAME = new QName("http://www.geni.net/resources/rspec/3", "disk_image");
    private final static QName _Install_QNAME = new QName("http://www.geni.net/resources/rspec/3", "install");
    private final static QName _ComponentHopContentsInterfaceRef_QNAME = new QName("http://www.geni.net/resources/rspec/3", "interface_ref");
    private final static QName _NodeContentsSliverType_QNAME = new QName("http://www.geni.net/resources/rspec/3", "sliver_type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.geni.resources.rspec._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComponentHopContents }
     * 
     */
    public ComponentHopContents createComponentHopContents() {
        return new ComponentHopContents();
    }

    /**
     * Create an instance of {@link NodeContents }
     * 
     */
    public NodeContents createNodeContents() {
        return new NodeContents();
    }

    /**
     * Create an instance of {@link InstallServiceContents }
     * 
     */
    public InstallServiceContents createInstallServiceContents() {
        return new InstallServiceContents();
    }

    /**
     * Create an instance of {@link DiskImageContents }
     * 
     */
    public DiskImageContents createDiskImageContents() {
        return new DiskImageContents();
    }

    /**
     * Create an instance of {@link ServiceContents }
     * 
     */
    public ServiceContents createServiceContents() {
        return new ServiceContents();
    }

    /**
     * Create an instance of {@link ExecuteServiceContents }
     * 
     */
    public ExecuteServiceContents createExecuteServiceContents() {
        return new ExecuteServiceContents();
    }

    /**
     * Create an instance of {@link Host }
     * 
     */
    public Host createHost() {
        return new Host();
    }

    /**
     * Create an instance of {@link HardwareTypeContents }
     * 
     */
    public HardwareTypeContents createHardwareTypeContents() {
        return new HardwareTypeContents();
    }

    /**
     * Create an instance of {@link LocationContents }
     * 
     */
    public LocationContents createLocationContents() {
        return new LocationContents();
    }

    /**
     * Create an instance of {@link LinkContents }
     * 
     */
    public LinkContents createLinkContents() {
        return new LinkContents();
    }

    /**
     * Create an instance of {@link RelationContents }
     * 
     */
    public RelationContents createRelationContents() {
        return new RelationContents();
    }

    /**
     * Create an instance of {@link LinkPropertyContents }
     * 
     */
    public LinkPropertyContents createLinkPropertyContents() {
        return new LinkPropertyContents();
    }

    /**
     * Create an instance of {@link InterfaceContents }
     * 
     */
    public InterfaceContents createInterfaceContents() {
        return new InterfaceContents();
    }

    /**
     * Create an instance of {@link IpContents }
     * 
     */
    public IpContents createIpContents() {
        return new IpContents();
    }

    /**
     * Create an instance of {@link RSpecContents }
     * 
     */
    public RSpecContents createRSpecContents() {
        return new RSpecContents();
    }

    /**
     * Create an instance of {@link ComponentManager }
     * 
     */
    public ComponentManager createComponentManager() {
        return new ComponentManager();
    }

    /**
     * Create an instance of {@link LoginServiceContents }
     * 
     */
    public LoginServiceContents createLoginServiceContents() {
        return new LoginServiceContents();
    }

    /**
     * Create an instance of {@link LinkClass }
     * 
     */
    public LinkClass createLinkClass() {
        return new LinkClass();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link InterfaceRefContents }
     * 
     */
    public InterfaceRefContents createInterfaceRefContents() {
        return new InterfaceRefContents();
    }

    /**
     * Create an instance of {@link ComponentHopContents.InterfaceRef }
     * 
     */
    public ComponentHopContents.InterfaceRef createComponentHopContentsInterfaceRef() {
        return new ComponentHopContents.InterfaceRef();
    }

    /**
     * Create an instance of {@link NodeContents.SliverType }
     * 
     */
    public NodeContents.SliverType createNodeContentsSliverType() {
        return new NodeContents.SliverType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentHopContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "component_hop")
    public JAXBElement<ComponentHopContents> createComponentHop(ComponentHopContents value) {
        return new JAXBElement<ComponentHopContents>(_ComponentHop_QNAME, ComponentHopContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "login")
    public JAXBElement<LoginServiceContents> createLogin(LoginServiceContents value) {
        return new JAXBElement<LoginServiceContents>(_Login_QNAME, LoginServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSpecContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "rspec")
    public JAXBElement<RSpecContents> createRspec(RSpecContents value) {
        return new JAXBElement<RSpecContents>(_Rspec_QNAME, RSpecContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "node")
    public JAXBElement<NodeContents> createNode(NodeContents value) {
        return new JAXBElement<NodeContents>(_Node_QNAME, NodeContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "ip")
    public JAXBElement<IpContents> createIp(IpContents value) {
        return new JAXBElement<IpContents>(_Ip_QNAME, IpContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "interface")
    public JAXBElement<InterfaceContents> createInterface(InterfaceContents value) {
        return new JAXBElement<InterfaceContents>(_Interface_QNAME, InterfaceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkPropertyContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "property")
    public JAXBElement<LinkPropertyContents> createProperty(LinkPropertyContents value) {
        return new JAXBElement<LinkPropertyContents>(_Property_QNAME, LinkPropertyContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "relation")
    public JAXBElement<RelationContents> createRelation(RelationContents value) {
        return new JAXBElement<RelationContents>(_Relation_QNAME, RelationContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "link")
    public JAXBElement<LinkContents> createLink(LinkContents value) {
        return new JAXBElement<LinkContents>(_Link_QNAME, LinkContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HardwareTypeContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "hardware_type")
    public JAXBElement<HardwareTypeContents> createHardwareType(HardwareTypeContents value) {
        return new JAXBElement<HardwareTypeContents>(_HardwareType_QNAME, HardwareTypeContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "location")
    public JAXBElement<LocationContents> createLocation(LocationContents value) {
        return new JAXBElement<LocationContents>(_Location_QNAME, LocationContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "services")
    public JAXBElement<ServiceContents> createServices(ServiceContents value) {
        return new JAXBElement<ServiceContents>(_Services_QNAME, ServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "execute")
    public JAXBElement<ExecuteServiceContents> createExecute(ExecuteServiceContents value) {
        return new JAXBElement<ExecuteServiceContents>(_Execute_QNAME, ExecuteServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiskImageContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "disk_image")
    public JAXBElement<DiskImageContents> createDiskImage(DiskImageContents value) {
        return new JAXBElement<DiskImageContents>(_DiskImage_QNAME, DiskImageContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "install")
    public JAXBElement<InstallServiceContents> createInstall(InstallServiceContents value) {
        return new JAXBElement<InstallServiceContents>(_Install_QNAME, InstallServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentHopContents.InterfaceRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "interface_ref", scope = ComponentHopContents.class)
    public JAXBElement<ComponentHopContents.InterfaceRef> createComponentHopContentsInterfaceRef(ComponentHopContents.InterfaceRef value) {
        return new JAXBElement<ComponentHopContents.InterfaceRef>(_ComponentHopContentsInterfaceRef_QNAME, ComponentHopContents.InterfaceRef.class, ComponentHopContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceRefContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "interface_ref", scope = LinkContents.class)
    public JAXBElement<InterfaceRefContents> createLinkContentsInterfaceRef(InterfaceRefContents value) {
        return new JAXBElement<InterfaceRefContents>(_ComponentHopContentsInterfaceRef_QNAME, InterfaceRefContents.class, LinkContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeContents.SliverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "sliver_type", scope = NodeContents.class)
    public JAXBElement<NodeContents.SliverType> createNodeContentsSliverType(NodeContents.SliverType value) {
        return new JAXBElement<NodeContents.SliverType>(_NodeContentsSliverType_QNAME, NodeContents.SliverType.class, NodeContents.class, value);
    }

}
