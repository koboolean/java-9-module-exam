module domain.module {
    exports com.domain;
    exports com.domain.service;
    opens com.domain;

    provides com.domain.service.StringRepository with
            com.domain.service.MemoryStringRepository,
            com.domain.service.DatabaseStringRepository;
}
